# Jd
中兴软件仿京东电商项目实战

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
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad2','5299.0','/img/p011.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad4','5299.0','/img/p013.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad5','5299.0','/img/p04.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad37','5299.0','/img/p05.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad8','5299.0','/img/p06.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad39','5299.0','/img/p07.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad30','5299.0','/img/p08.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad31','5299.0','/img/p09.jpg','联想',122);
insert into o_goods values(o_goods_id_seq.nextval,'笔记本','thinkpad32','5299.0','/img/p010.jpg','联想',122);
<br/>
2 oracle分页<br>
rownum 分页
select * from (<br>
select A.* , rownum rn<br>
from (select* from o_goods) A where rownum<=8)where rn>=5 <br>


