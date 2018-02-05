## 2018.02.02 포워딩(Fowarding)

포워딩이란?


## 2018.02.05 Session

HTTP : 비연결성

[참고사이트](https://m.blog.naver.com/PostView.nhn?blogId=bluegriffin&logNo=40071262638&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F) HTTP특성 설명

세션트래킹 : HTTP 프로토콜의 비연결성 속성을 보완하는 기능으로 
             로그인에 대한 정보를 기록하였다가 로그인 정보가 
             필요한 곳에 그 정보를 사용하게 해주는 기술

[참고사이트](http://yoyojyv.tistory.com/29) 세션과 쿠키 설명

request.getSession(true) --> **scope: 브라우저**
			     session객체가 존재하면, 그 존재하는 개체 반환
	                     만약에 session객체가 없으면, session을 만들어서 반환

request.getSession(false) --> session 객체가 존재하면, 그 존재하는 객체 반환
			       만약에 session 객체가 없다면, null값을 반환합니다.

###### * 한 번 true로 생성이 되면 false로 한다고 해도 값이 생성되어있음.
###### * 처음부터 false로 되어야 값이 null로 반환됨.

### 세션트래킹 구현 순서
1. Session 객체 획득
   #### 로그인 처음할 때 (첫 서블릿)
   * request.getSession() or request.getSession(true)
   
   #### 로그인 후 (이후 서블릿)
   * request.getSession(false) 구현 후 response.sendRedirect("login.jsp");

   * 세션 생성
   HttpSession session = request.getSession();

2. Session에 데이터 바인딩(로그인 처음)
   * session.setAttribute("id", id);
   * session.setAttribute("pw", pw);


3. Session에 바인딩된 데이터 사용 (로그인 후 기능)
   * String id = (String) session.getAttribute("id");
   * String pw = (String) session.getAttribute("pw");

##### 포워딩을 하고 나면, 데이터 전송방식이 유지가 됨(x) 무조건 GET방식으로 변경됨.


#### 세션시간 변경하는 법
server의 web.xml로 가서 
    <session-config>
        <session-timeout>30</session-timeout>  ==> 여기 부분 수정(분단위)
    </session-config>     

       OR

session.setMaxInactiveInterval(30); ==> 로 수정이 가능하다. (얘는 초단위)
