# JpaStudy

이 저장소는 자바 ORM 표준 JPA 프로그래밍을 통해 배운 점을 남기는 저장소입니다.
이를 통해 JPA에 대하여 자세히 알아보고 프로젝트를 진행할 때 사용할 예정입니다.

#### 2021-05-17 첫번째 예제 실습

요구사항 분석
1. 회원은 상품을 주문할 수 있다.
2. 주문 시 여러 종류의 상품을 선택할 수 있다.

도메인 모델 분석
회원과 주문의 관계: 회원은 여러 번 주문할 수 있다.(일대다)
주문과 상품의 관계: 주문할 때 여러 상품을 선택할 수 있다. 
반대로 같은 상품도 여러 번 주문될 수 있다. 주문상품 이라는 모델을 만들어서 다대다 관계를 일대다, 다대일 관계로 풀어냄



