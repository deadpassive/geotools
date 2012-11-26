package org.geotools.wcs.bindings;


import java.util.List;
import org.geotools.wcs.WCS;
import org.geotools.xml.*;


import javax.xml.namespace.QName;
import net.opengis.wcs10.GetType;
import net.opengis.wcs10.HTTPType;
import net.opengis.wcs10.OnlineResourceType;
import net.opengis.wcs10.PostType;
import net.opengis.wcs10.Wcs10Factory;
import org.eclipse.emf.ecore.EFactory;

/**
 * Binding object for the type http://www.opengis.net/wcs:DCPTypeType_HTTP.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="DCPTypeType_HTTP"&gt;
 *      &lt;choice maxOccurs="unbounded"&gt;
 *          &lt;element name="Get"&gt;
 *              &lt;complexType&gt;
 *                  &lt;sequence&gt;
 *                      &lt;element name="OnlineResource" type="wcs:OnlineResourceType"/&gt;
 *                  &lt;/sequence&gt;
 *              &lt;/complexType&gt;
 *          &lt;/element&gt;
 *          &lt;element name="Post"&gt;
 *              &lt;complexType&gt;
 *                  &lt;sequence&gt;
 *                      &lt;element name="OnlineResource" type="wcs:OnlineResourceType"/&gt;
 *                  &lt;/sequence&gt;
 *              &lt;/complexType&gt;
 *          &lt;/element&gt;
 *      &lt;/choice&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 *
 *
 * @source $URL$
 */
public class DCPTypeType_HTTPBinding extends AbstractComplexBinding {
        
	/**
	 * @generated
	 */
	public QName getTarget() {
		return WCS.DCPTypeType_HTTP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return HTTPType.class;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
            Wcs10Factory factory = Wcs10Factory.eINSTANCE;
            HTTPType httpType = factory.createHTTPType();
            
            List gets = node.getChildren("Get");
            for (Object get : gets) {
                Node getNode = (Node) get;
                String url = getNode.getValue().toString();
                GetType getType = factory.createGetType();
                OnlineResourceType onlineResource = factory.createOnlineResourceType();
                onlineResource.setHref(url);
                getType.setOnlineResource(onlineResource);
                httpType.getGet().add(getType);
            }
            
            List posts = node.getChildren("Post");
            for (Object post : posts) {
                Node postNode = (Node) post;
                String url = postNode.getValue().toString();
                PostType postType = factory.createPostType();
                OnlineResourceType onlineResource = factory.createOnlineResourceType();
                onlineResource.setHref(url);
                postType.setOnlineResource(onlineResource);
                httpType.getPost().add(postType);
            }
		
            return httpType;
	}

}
