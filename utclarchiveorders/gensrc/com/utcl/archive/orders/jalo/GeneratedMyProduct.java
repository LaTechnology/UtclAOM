/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 13, 2023, 12:58:13 PM                   ---
 * ----------------------------------------------------------------
 */
package com.utcl.archive.orders.jalo;

import com.utcl.archive.orders.constants.UtclarchiveordersConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.utcl.archive.orders.jalo.MyProduct MyProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyProduct extends Product
{
	/** Qualifier of the <code>MyProduct.myExampleInitialStringField</code> attribute **/
	public static final String MYEXAMPLEINITIALSTRINGFIELD = "myExampleInitialStringField";
	/** Qualifier of the <code>MyProduct.myExampleBooleanField</code> attribute **/
	public static final String MYEXAMPLEBOOLEANFIELD = "myExampleBooleanField";
	/** Qualifier of the <code>MyProduct.media</code> attribute **/
	public static final String MEDIA = "media";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MYEXAMPLEINITIALSTRINGFIELD, AttributeMode.INITIAL);
		tmp.put(MYEXAMPLEBOOLEANFIELD, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.media</code> attribute.
	 * @return the media
	 */
	public Media getMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, MEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.media</code> attribute.
	 * @return the media
	 */
	public Media getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.media</code> attribute. 
	 * @param value the media
	 */
	public void setMedia(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.media</code> attribute. 
	 * @param value the media
	 */
	public void setMedia(final Media value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleBooleanField</code> attribute.
	 * @return the myExampleBooleanField - Example Initial Boolean Field
	 */
	public Boolean isMyExampleBooleanField(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MYEXAMPLEBOOLEANFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleBooleanField</code> attribute.
	 * @return the myExampleBooleanField - Example Initial Boolean Field
	 */
	public Boolean isMyExampleBooleanField()
	{
		return isMyExampleBooleanField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @return the myExampleBooleanField - Example Initial Boolean Field
	 */
	public boolean isMyExampleBooleanFieldAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMyExampleBooleanField( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @return the myExampleBooleanField - Example Initial Boolean Field
	 */
	public boolean isMyExampleBooleanFieldAsPrimitive()
	{
		return isMyExampleBooleanFieldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @param value the myExampleBooleanField - Example Initial Boolean Field
	 */
	public void setMyExampleBooleanField(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MYEXAMPLEBOOLEANFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @param value the myExampleBooleanField - Example Initial Boolean Field
	 */
	public void setMyExampleBooleanField(final Boolean value)
	{
		setMyExampleBooleanField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @param value the myExampleBooleanField - Example Initial Boolean Field
	 */
	public void setMyExampleBooleanField(final SessionContext ctx, final boolean value)
	{
		setMyExampleBooleanField( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleBooleanField</code> attribute. 
	 * @param value the myExampleBooleanField - Example Initial Boolean Field
	 */
	public void setMyExampleBooleanField(final boolean value)
	{
		setMyExampleBooleanField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleInitialStringField</code> attribute.
	 * @return the myExampleInitialStringField - My Example Initial String Value
	 */
	public String getMyExampleInitialStringField(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MYEXAMPLEINITIALSTRINGFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.myExampleInitialStringField</code> attribute.
	 * @return the myExampleInitialStringField - My Example Initial String Value
	 */
	public String getMyExampleInitialStringField()
	{
		return getMyExampleInitialStringField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleInitialStringField</code> attribute. 
	 * @param value the myExampleInitialStringField - My Example Initial String Value
	 */
	public void setMyExampleInitialStringField(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MYEXAMPLEINITIALSTRINGFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.myExampleInitialStringField</code> attribute. 
	 * @param value the myExampleInitialStringField - My Example Initial String Value
	 */
	public void setMyExampleInitialStringField(final String value)
	{
		setMyExampleInitialStringField( getSession().getSessionContext(), value );
	}
	
}
