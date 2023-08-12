package groupProject.database.service.serviceInterface;

import groupProject.database.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
User create(User user);
User update(Long id, User user);

void delete(Long id);
User findById(Long id);

}
