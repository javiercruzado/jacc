package edu.jacc.expensemanager.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bills database table.
 * 
 */
@Entity
@Table(name="bills")
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="_id")
	private Integer id;

	private BigDecimal amount;

	private Boolean demo;

	private String note;

	private Short recorded;

	@Column(name="recorded_month")
	private Short recordedMonth;

	@Column(name="recorded_week")
	private Short recordedWeek;

	@Column(name="recorded_year")
	private Short recordedYear;

	@Column(name="TYPE")
	private short type;

	@Column(name="type_id")
	private short typeId;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	public Bill() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Boolean getDemo() {
		return this.demo;
	}

	public void setDemo(Boolean demo) {
		this.demo = demo;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Short getRecorded() {
		return this.recorded;
	}

	public void setRecorded(Short recorded) {
		this.recorded = recorded;
	}

	public Short getRecordedMonth() {
		return this.recordedMonth;
	}

	public void setRecordedMonth(Short recordedMonth) {
		this.recordedMonth = recordedMonth;
	}

	public Short getRecordedWeek() {
		return this.recordedWeek;
	}

	public void setRecordedWeek(Short recordedWeek) {
		this.recordedWeek = recordedWeek;
	}

	public Short getRecordedYear() {
		return this.recordedYear;
	}

	public void setRecordedYear(Short recordedYear) {
		this.recordedYear = recordedYear;
	}

	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public short getTypeId() {
		return this.typeId;
	}

	public void setTypeId(short typeId) {
		this.typeId = typeId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}