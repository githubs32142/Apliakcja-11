package pl.techstyle.model;

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
@Table(name="Wydawca")
@Data
@NoArgsConstructor
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_wydawcy")
	int id;
	
	@Column(name="Nazwa_wydawcy")
	String namePublisher;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="publisher")
	List<PublisherBook> publishers= new ArrayList<>();
	
}
