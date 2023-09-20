/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 13, 2023, 12:58:13 PM                   ---
 * ----------------------------------------------------------------
 */
package com.utcl.archive.orders.jalo;

import com.utcl.archive.orders.constants.UtclarchiveordersConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.Order;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.order.Order ArchivalOrders}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedArchivalOrders extends Order
{
	/** Qualifier of the <code>ArchivalOrders.archivalOrderId</code> attribute **/
	public static final String ARCHIVALORDERID = "archivalOrderId";
	/** Qualifier of the <code>ArchivalOrders.archivalCreationTime</code> attribute **/
	public static final String ARCHIVALCREATIONTIME = "archivalCreationTime";
	/** Qualifier of the <code>ArchivalOrders.createdBy</code> attribute **/
	public static final String CREATEDBY = "createdBy";
	/** Qualifier of the <code>ArchivalOrders.modifiedBy</code> attribute **/
	public static final String MODIFIEDBY = "modifiedBy";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Order.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ARCHIVALORDERID, AttributeMode.INITIAL);
		tmp.put(ARCHIVALCREATIONTIME, AttributeMode.INITIAL);
		tmp.put(CREATEDBY, AttributeMode.INITIAL);
		tmp.put(MODIFIEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.archivalCreationTime</code> attribute.
	 * @return the archivalCreationTime
	 */
	public Date getArchivalCreationTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARCHIVALCREATIONTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.archivalCreationTime</code> attribute.
	 * @return the archivalCreationTime
	 */
	public Date getArchivalCreationTime()
	{
		return getArchivalCreationTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.archivalCreationTime</code> attribute. 
	 * @param value the archivalCreationTime
	 */
	protected void setArchivalCreationTime(final SessionContext ctx, final Date value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+ARCHIVALCREATIONTIME+"' is not changeable", 0 );
		}
		setProperty(ctx, ARCHIVALCREATIONTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.archivalCreationTime</code> attribute. 
	 * @param value the archivalCreationTime
	 */
	protected void setArchivalCreationTime(final Date value)
	{
		setArchivalCreationTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.archivalOrderId</code> attribute.
	 * @return the archivalOrderId
	 */
	public String getArchivalOrderId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ARCHIVALORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.archivalOrderId</code> attribute.
	 * @return the archivalOrderId
	 */
	public String getArchivalOrderId()
	{
		return getArchivalOrderId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.archivalOrderId</code> attribute. 
	 * @param value the archivalOrderId
	 */
	public void setArchivalOrderId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ARCHIVALORDERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.archivalOrderId</code> attribute. 
	 * @param value the archivalOrderId
	 */
	public void setArchivalOrderId(final String value)
	{
		setArchivalOrderId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public String getCreatedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public String getCreatedBy()
	{
		return getCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final String value)
	{
		setCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODIFIEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArchivalOrders.modifiedBy</code> attribute.
	 * @return the modifiedBy
	 */
	public String getModifiedBy()
	{
		return getModifiedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODIFIEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ArchivalOrders.modifiedBy</code> attribute. 
	 * @param value the modifiedBy
	 */
	public void setModifiedBy(final String value)
	{
		setModifiedBy( getSession().getSessionContext(), value );
	}
	
}
