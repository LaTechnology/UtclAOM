/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 13, 2023, 12:58:13 PM                   ---
 * ----------------------------------------------------------------
 */
package com.utcl.archive.orders.jalo;

import com.utcl.archive.orders.constants.UtclarchiveordersConstants;
import com.utcl.archive.orders.jalo.ArchivalOrders;
import com.utcl.archive.orders.jalo.MyProduct;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>UtclarchiveordersManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedUtclarchiveordersManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("archivalStatus", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.archivalStatus</code> attribute.
	 * @return the archivalStatus
	 */
	public Boolean isArchivalStatus(final SessionContext ctx, final Order item)
	{
		return (Boolean)item.getProperty( ctx, UtclarchiveordersConstants.Attributes.Order.ARCHIVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.archivalStatus</code> attribute.
	 * @return the archivalStatus
	 */
	public Boolean isArchivalStatus(final Order item)
	{
		return isArchivalStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.archivalStatus</code> attribute. 
	 * @return the archivalStatus
	 */
	public boolean isArchivalStatusAsPrimitive(final SessionContext ctx, final Order item)
	{
		Boolean value = isArchivalStatus( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.archivalStatus</code> attribute. 
	 * @return the archivalStatus
	 */
	public boolean isArchivalStatusAsPrimitive(final Order item)
	{
		return isArchivalStatusAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.archivalStatus</code> attribute. 
	 * @param value the archivalStatus
	 */
	public void setArchivalStatus(final SessionContext ctx, final Order item, final Boolean value)
	{
		item.setProperty(ctx, UtclarchiveordersConstants.Attributes.Order.ARCHIVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.archivalStatus</code> attribute. 
	 * @param value the archivalStatus
	 */
	public void setArchivalStatus(final Order item, final Boolean value)
	{
		setArchivalStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.archivalStatus</code> attribute. 
	 * @param value the archivalStatus
	 */
	public void setArchivalStatus(final SessionContext ctx, final Order item, final boolean value)
	{
		setArchivalStatus( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.archivalStatus</code> attribute. 
	 * @param value the archivalStatus
	 */
	public void setArchivalStatus(final Order item, final boolean value)
	{
		setArchivalStatus( getSession().getSessionContext(), item, value );
	}
	
	public ArchivalOrders createArchivalOrders(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( UtclarchiveordersConstants.TC.ARCHIVALORDERS );
			return (ArchivalOrders)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ArchivalOrders : "+e.getMessage(), 0 );
		}
	}
	
	public ArchivalOrders createArchivalOrders(final Map attributeValues)
	{
		return createArchivalOrders( getSession().getSessionContext(), attributeValues );
	}
	
	public MyProduct createMyProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( UtclarchiveordersConstants.TC.MYPRODUCT );
			return (MyProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyProduct : "+e.getMessage(), 0 );
		}
	}
	
	public MyProduct createMyProduct(final Map attributeValues)
	{
		return createMyProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return UtclarchiveordersConstants.EXTENSIONNAME;
	}
	
}
