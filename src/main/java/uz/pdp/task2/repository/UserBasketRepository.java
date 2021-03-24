package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.User;
import uz.pdp.task2.entity.UserBasket;
import uz.pdp.task2.projection.CustomUser;
import uz.pdp.task2.projection.CustomUserBasket;

@RepositoryRestResource(path = "userBasket", collectionResourceRel = "list", excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
