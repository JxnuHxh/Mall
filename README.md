# Jd
中兴软件仿京东电商项目实战

###项目准备环境  <br>
jdk>=1.8  <br>
idea>=2017  <br>
maven  <br>
oracle11g  <br>


用户表<br>
create table O_user(<br>
id number(6) not null,<br>
userName VARCHAR2(20),<br>
pass VARCHAR2(20),<br>
primary key(id)<br>
);<br>
primary key(id)(标记主键）<br>

create sequence o_user_seq;<br>

insert into o_user(id,userName,pass) values(o_user_seq.nextval,'sun10','sun10');
<br>
商品表<br>
create table o_goods(<br>
    id number(8) not null,  <br>
     type varchar2(100) not null,<br>
title varchar2(300) not null,<br>
price number(8,2) not null,<br>
imgURL VARCHAR2(100) not null,<br>
manufacturer VARCHAR2(40) not null,<br>
evaluate number(10) not null,<br>
primary key(id)<br>
);<br>

create sequence o_goods_id_seq;<br>

插入数据<br>
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad3','5299.0','/img/p01.jpg','联想',122);
 
### oracle分页<br>
rownum 分页<br>
select * from (<br>
select A.* , rownum rn<br>
from (select* from o_goods) A where rownum<=8)where rn>=5 <br>

看代码是不是比较优<br>
1 如果代码需求改变， 代码修改要最少<br>
2 代码规范 大小写 命名 包  注释:<br>
3 运行效率
<br>
4 可扩展性
