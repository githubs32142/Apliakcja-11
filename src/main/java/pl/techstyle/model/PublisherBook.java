package pl.techstyle.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="wydawca_ksiazki")
@Data
@NoArgsConstructor
public class PublisherBook implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	int id;

	@Column(name="Data_wydania")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="id_ksiazki", nullable=false)
	Book book;
	
	@ManyToOne
	@JoinColumn(name="id_wydawcy")
	Publisher publisher;
}
