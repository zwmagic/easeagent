package com.megaease.easeagent.sniffer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServletAdviceTest extends BaseSnifferTest {

//    @Test
//    public void success() throws Exception {
//        AgentInterceptorChain.Builder builder = new DefaultAgentInterceptorChain.Builder().addInterceptor(mock(AgentInterceptor.class));
//        final Definition.Default def = new GenHttpServletAdvice().define(Definition.Default.EMPTY);
//        String baseName = HttpServletAdviceTest.class.getName();
//        final ClassLoader loader = new URLClassLoader(new URL[0]);
//        AgentInterceptorChainInvoker chainInvoker = spy(AgentInterceptorChainInvoker.getInstance());
//        final HttpServlet httpServlet = (HttpServlet) Classes.transform(baseName + "$MyHttpServlet")
//                .with(def, new QualifiedBean("", chainInvoker), new QualifiedBean("agentInterceptorChainBuilder4Filter", builder))
//                .load(loader).get(0).newInstance();
//
//        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
//        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
//        httpServlet.service(httpServletRequest, httpServletResponse);
//
//        this.verifyInvokeTimes(chainInvoker, 1);
//
//    }

    public static class MyHttpServlet extends HttpServlet {

        public MyHttpServlet() {
        }

        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // do nothing
        }
    }
}
