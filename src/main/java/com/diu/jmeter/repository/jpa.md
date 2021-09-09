JPA(Java Persistence API)意即Java持久化API，是Sun官方在JDK5.0后提出的Java持久化规范（JSR 338，这些接口所在包为javax.persistence， 详细内容可参考https://github.com/javaee/jpa-spec）
JPA的出现主要是为了简化持久层开发以及整合ORM技术，结束Hibernate、TopLink、JDO等ORM框架各自为营的局面。
JPA是在吸收现有ORM框架的基础上发展而来，易于使用，伸缩性强。

总的来说，JPA包括以下3方面的技术：

    ORM映射元数据： 支持XML和注解两种元数据的形式，元数据描述对象和表之间的映射关系
    API： 操作实体对象来执行CRUD操作
    查询语言： 通过面向对象而非面向数据库的查询语言（JPQL）查询数据，避免程序的SQL语句紧密耦合

查询
    studentRepository.findAll(); 全部查询
增加
    new Student(null, 2, "刘舒冉", "lsrs123", 21, "江西南昌", "18154195313",new Timestamp(System.currentTimeMillis()),"200");
    studentRepository.save(student); 增加增加学生用户 注意的是：当id有值的时候就是一个修改的操作，首先查询，在修改学生数据