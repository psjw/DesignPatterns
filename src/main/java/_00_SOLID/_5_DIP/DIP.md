<h2>SOLID</h2>

<h3>5. DIP(의존 역전 원칙) : Dependency Inversion Principle</h3>

> 고수준 모델이 저수준 모델에 의존해서는 안된다.

- ex1) Fan은 저수준의 모델이고 Switch는 고수준의 모델인데 Switch는 Fan이라는 변수를 갖고 있으며 Fan에 의존하게 되므로 저수준의 모델에 의존하게 된다.

    - Switchable이라는 인터페이스를 만들고 Fan은 Switchable을 구현하고 Switch는 Swichable의 변수를 갖고서 Switchable을 on/off한다. 
    - 추후 다른 기기가 추가되더라도 Switchable을 상속받은 기기의 on/off 제어가 가능하다.
