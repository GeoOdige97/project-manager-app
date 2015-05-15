/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.ateamcomp354.projectmanagerapp.tables.SqliteSequence;
import org.jooq.impl.TableRecordImpl;


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
public class SqliteSequenceRecord extends TableRecordImpl<SqliteSequenceRecord> implements Record2<Object, Object> {

	private static final long serialVersionUID = 1000119830;

	/**
	 * Setter for <code>sqlite_sequence.name</code>.
	 */
	public void setName(Object value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sqlite_sequence.name</code>.
	 */
	public Object getName() {
		return (Object) getValue(0);
	}

	/**
	 * Setter for <code>sqlite_sequence.seq</code>.
	 */
	public void setSeq(Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sqlite_sequence.seq</code>.
	 */
	public Object getSeq() {
		return (Object) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Object, Object> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Object, Object> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field1() {
		return SqliteSequence.SQLITE_SEQUENCE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field2() {
		return SqliteSequence.SQLITE_SEQUENCE.SEQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value2() {
		return getSeq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord value1(Object value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord value2(Object value) {
		setSeq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SqliteSequenceRecord values(Object value1, Object value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SqliteSequenceRecord
	 */
	public SqliteSequenceRecord() {
		super(SqliteSequence.SQLITE_SEQUENCE);
	}

	/**
	 * Create a detached, initialised SqliteSequenceRecord
	 */
	public SqliteSequenceRecord(Object name, Object seq) {
		super(SqliteSequence.SQLITE_SEQUENCE);

		setValue(0, name);
		setValue(1, seq);
	}
}
