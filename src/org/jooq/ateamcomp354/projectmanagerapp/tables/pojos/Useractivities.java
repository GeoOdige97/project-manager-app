/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Useractivities implements Serializable {

	private static final long serialVersionUID = -596192511;

	private Integer activityId;
	private Integer userId;

	public Useractivities() {}

	public Useractivities(Useractivities value) {
		this.activityId = value.activityId;
		this.userId = value.userId;
	}

	public Useractivities(
		Integer activityId,
		Integer userId
	) {
		this.activityId = activityId;
		this.userId = userId;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
