Spring5_kame_studying
=========================
+ This is a project I recorded while studying a book called &amp;lt;Spring 5 Programming Introduction for Beginner Web Developers.

생성자 DI방식 VS 세터 메서드 DI방식
======================================

+ 생성자 방식 : 빈 객체를 생성하는 시점에 모든 의존 객체가 주입된다. 
  + 장점 : 빈 객체를 생성하는 시점에 필요한 모든 의존 객체를 주입받기 떄문에 객체를 사용할 때 완전한 상태로 사용할 수 있다. 
  + 단점 : 생성자의 파라미터 개수가 많을 경우 각 인자가 어떤 의존 객체를 설정하는지 알아내려면 생성자의 코드를 확인해야한다.

+ 설정 메서드 방식 : 세터 메서드 이름을 통해 어떤 의존 객체가 주입되는지 알 수 있다. 
  + 장점 : 메서드 이름만으로도 어떤 의존 객체를 설정하는지 쉽게 유추할 수 있다. 
  + 단점 : 세터 메서드를 사용해서 필요한 의존 객체를 전달하지 않아도 빈 객체가 생성되기 때문에 객체를 사용하는 시점에서 NulllPointException 이 발생할수 있다.

