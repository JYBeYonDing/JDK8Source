/***** Lobxxx Translate Finished ******/
package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInterceptorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, April 30, 2015 12:42:09 PM PDT
*/


/**
   * Interceptor used to establish tagged components in the profiles within 
   * an IOR.
   * <p>
   * In some cases, a portable ORB service implementation may need to add 
   * information describing the server's or object's ORB service related 
   * capabilities to object references in order to enable the ORB service 
   * implementation in the client to function properly. 
   * <p>
   * This is supported through the <code>IORInterceptor</code> and 
   * <code>IORInfo</code> interfaces. 
   *
   * <p>
   *  拦截器用于在IOR中的配置文件中建立标记的组件。
   * <p>
   *  在某些情况下,便携式ORB服务实现可能需要向对象引用添加描述服务器或对象的ORB服务相关功能的信息,以便使客户端中的ORB服务实现正常运行。
   * <p>
   *  这是通过<code> IORInterceptor </code>和<code> IORInfo </code>接口支持的。
   * 
   * 
   * @see IORInfo
   */
public interface IORInterceptorOperations  extends org.omg.PortableInterceptor.InterceptorOperations
{

  /**
     * A server side ORB calls the <code>establish_components</code> 
     * operation on all registered <code>IORInterceptor</code> instances 
     * when it is assembling the list of components that will be included 
     * in the profile or profiles of an object reference. This operation 
     * is not necessarily called for each individual object reference. 
     * In the case of the POA, this operation is called each time POA::create_POA
     * is called.  In any case, <code>establish_components</code> is 
     * guaranteed to be called at least once for each distinct set of 
     * server policies. 
     * <p>
     * An implementation of <code>establish_components</code> must not 
     * throw exceptions. If it does, the ORB shall ignore the exception 
     * and proceed to call the next IOR Interceptor's 
     * <code>establish_components</code> operation. 
     *
     * <p>
     *  当服务器端ORB组装将包括在对象引用的简档或简档中的组件的列表时,服务器侧ORB调用所有注册的<code> IORInterceptor </code>实例上的<code> establish_com
     * ponents </code>对于每个单独的对象引用,不一定调用此操作。
     * 在POA的情况下,每次调用POA :: create_POA时调用此操作。
     * 在任何情况下,对于每个不同的服务器策略集合,保证调用<code> establish_components </code>至少一次。
     * 
     * @param info The <code>IORInfo</code> instance used by the ORB 
     *     service to query applicable policies and add components to be 
     *     included in the generated IORs.
     */
  void establish_components (org.omg.PortableInterceptor.IORInfo info);
} // interface IORInterceptorOperations
