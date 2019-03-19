package fr.wevioofrance.devops.demo.services;

import javax.ejb.Remote;

import fr.wevioofrance.devops.demo.entities.User;
import fr.wevioofrance.devops.demo.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
