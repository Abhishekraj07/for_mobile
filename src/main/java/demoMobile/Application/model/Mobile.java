package demoMobile.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mobile")
public class Mobile {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mobile_id")
	private Long MobileId;
	@Column(name = "retrive_id")
	private String RetriveId;
	@Column(name = "brand")
	private String Brand;
	@Column(name = "price")
	private int Price;
	@Column(name = "contry")
	private String Contry;
	@Column(name = "spec")
	private String Specification;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(Long mobileId, String retriveId, String brand, int price, String contry, String specification) {
		super();
		MobileId = mobileId;
		RetriveId = retriveId;
		Brand = brand;
		Price = price;
		Contry = contry;
		Specification = specification;
	}
	public Long getMobileId() {
		return MobileId;
	}
	public void setMobileId(Long mobileId) {
		MobileId = mobileId;
	}
	public String getRetriveId() {
		return RetriveId;
	}
	public void setRetriveId(String retriveId) {
		RetriveId = retriveId;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getContry() {
		return Contry;
	}
	public void setContry(String contry) {
		Contry = contry;
	}
	public String getSpecification() {
		return Specification;
	}
	public void setSpecification(String specification) {
		Specification = specification;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
		result = prime * result + ((Contry == null) ? 0 : Contry.hashCode());
		result = prime * result + ((MobileId == null) ? 0 : MobileId.hashCode());
		result = prime * result + Price;
		result = prime * result + ((RetriveId == null) ? 0 : RetriveId.hashCode());
		result = prime * result + ((Specification == null) ? 0 : Specification.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (Contry == null) {
			if (other.Contry != null)
				return false;
		} else if (!Contry.equals(other.Contry))
			return false;
		if (MobileId == null) {
			if (other.MobileId != null)
				return false;
		} else if (!MobileId.equals(other.MobileId))
			return false;
		if (Price != other.Price)
			return false;
		if (RetriveId == null) {
			if (other.RetriveId != null)
				return false;
		} else if (!RetriveId.equals(other.RetriveId))
			return false;
		if (Specification == null) {
			if (other.Specification != null)
				return false;
		} else if (!Specification.equals(other.Specification))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mobile [MobileId=" + MobileId + ", RetriveId=" + RetriveId + ", Brand=" + Brand + ", Price=" + Price
				+ ", Contry=" + Contry + ", Specification=" + Specification + "]";
	}
	
	

}
