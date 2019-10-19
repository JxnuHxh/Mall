# Jd
中兴软件仿京东电商项目

用户表
create table O_user(
id number(6) not null,
userName VARCHAR2(20),
pass VARCHAR2(20),
primary key(id)
);
primary key(id)(标记主键）

create sequence o_user_seq;

insert into o_user(id,userName,pass) values(o_user_seq.nextval,'sun10','sun10');

商品表
create table o_goods(
    id number(8) not null,  
     type varchar2(100) not null,
title varchar2(300) not null,
price number(8,2) not null,
imgURL VARCHAR2(100) not null,
manufacturer VARCHAR2(40) not null,
evaluate number(10) not null,
primary key(id)

);

create sequence o_goods_id_seq;

插入数据

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

分页查询的思路：
1 mysql limit 1,4;

2 oracle分页
rownum 分页
select * from (
select A.* , rownum rn
from (select* from o_goods) A where rownum<=8)where rn>=5 


