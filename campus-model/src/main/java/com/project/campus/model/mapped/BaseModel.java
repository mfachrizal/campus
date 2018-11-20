package com.project.campus.model.mapped;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseModel {

	@Column(name = "CREATED_BY", length = 30)
	private String createdBy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DT", length = 19)
	private Date createdDt;
	@Column(name = "MODIFIED_BY", length = 30)
	private String modifiedBy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DT", length = 19)
	private Date modifiedDt;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

}
