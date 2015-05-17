/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.ateamcomp354.projectmanagerapp.DefaultSchema;
import org.jooq.ateamcomp354.projectmanagerapp.Keys;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.UsersRecord;
import org.jooq.impl.TableImpl;


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
public class Users extends TableImpl<UsersRecord> {

	private static final long serialVersionUID = 1848279442;

	/**
	 * The reference instance of <code>users</code>
	 */
	public static final Users USERS = new Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UsersRecord> getRecordType() {
		return UsersRecord.class;
	}

	/**
	 * The column <code>users.id</code>.
	 */
	public final TableField<UsersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>users.first_name</code>.
	 */
	public final TableField<UsersRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>users.last_name</code>.
	 */
	public final TableField<UsersRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>users.username</code>.
	 */
	public final TableField<UsersRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>users</code> table reference
	 */
	public Users() {
		this("users", null);
	}

	/**
	 * Create an aliased <code>users</code> table reference
	 */
	public Users(String alias) {
		this(alias, USERS);
	}

	private Users(String alias, Table<UsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Users(String alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UsersRecord> getPrimaryKey() {
		return Keys.PK_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UsersRecord>> getKeys() {
		return Arrays.<UniqueKey<UsersRecord>>asList(Keys.PK_USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Users as(String alias) {
		return new Users(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Users rename(String name) {
		return new Users(name, null);
	}
}
