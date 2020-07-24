package demoMobile.Application.Service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import demoMobile.Application.model.Mobile;

public interface MobileService extends JpaRepository<Mobile, Long> {
	
	@Query(value = "SELECT * "
			+ "FROM Mobile;", nativeQuery = true)
	public Set<Mobile> getAllMobile();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Mobile (retrive_id, brand, price,contry,spec) values(?,?,?,?,?);", nativeQuery = true)
	int addMobile(String retrive_id, String brand, int price,String contry,String spec);

}
