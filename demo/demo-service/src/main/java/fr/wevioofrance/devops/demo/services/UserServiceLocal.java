package fr.wevioofrance.devops.demo.services;

import javax.ejb.Local;

import fr.wevioofrance.devops.demo.entities.User;
import fr.wevioofrance.devops.demo.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
