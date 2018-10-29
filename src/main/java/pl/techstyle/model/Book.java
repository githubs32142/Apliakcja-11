package pl.techstyle.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="Ksiazka ")
@Data
@NoArgsConstructor
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8475926317772838612L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ksiazki")
	int id;
	
	@Column(name="Tytul")
	String title;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="book")
	List<PublisherBook> books= new ArrayList<>();

}
