package lk.ijse.dep9.app.service.custom.impl;

import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.dao.util.ConnectionUtil;
import lk.ijse.dep9.app.dto.UserDTO;
import lk.ijse.dep9.app.entity.User;
import lk.ijse.dep9.app.exception.AccessDenideException;
import lk.ijse.dep9.app.service.custom.UserService;
import lk.ijse.dep9.app.util.Transformer;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.SQLException;
@Component
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final Transformer transformer;

    public UserServiceImpl(UserDAO userDAO, Transformer transformer) {
        this.userDAO = userDAO;
        this.transformer = transformer;
    }


    @Override
    public void createNewUserAccount(UserDTO userDTO) {
        userDTO.setPassword(DigestUtils.sha256Hex(userDTO.getPassword()));
        userDAO.save(transformer.toUser(userDTO));
//        if (true) throw  new RuntimeException("failed");
//        userDAO.save(new User("testing","testing","testing"));
    }

    @Override
    public UserDTO verifyUser(String username, String password) {
        UserDTO user = userDAO.findById(username).map(transformer::touserDTO)
                .orElseThrow( AccessDenideException::new);
    if (DigestUtils.sha256Hex(password).equals(user.getPassword())){
        return user;
    }
    throw new AccessDenideException();

    }
}
