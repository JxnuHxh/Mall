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
<br>
第一次作业<br>
public class B{<br>
static boolean foo(char c){<br>
System.out.print(c);<br>
return true;<br>
}<br>
public static void main(String[] args){<br>
int i=0;<br>
for(foo('A');foo('B')&&(i<2);foo('C')){<br>
i++;<br>
foo('D');<br>
}   <br>
}
}<br>
输出的结果是什么？<br>
结果是ABDCBDCB<br>


1.	equals和==的区别<br>
答： ==比较的是操作符两端的操作数是否是同一个对象<br>
equals比较的是两个对象的内容是否相同<br>

2.	HashMap 底层实现原理<br>
答：HashMap通过固定值key获取内容 是数组+链表的数据结构
<br>底层使用的是数组和哈希的方式实现 通过key找value时间复杂度为O(1)
<br>Key的哈希可能会发生碰撞 解决哈希碰撞有两种方法 1数组长度与容量比达到0.75时
<br>扩容一倍容量 并重新哈希已经哈希的值 2碰撞时以连链表的结点接在后面 链表元素大于8时转化为红黑树结构提高效率

3.	什么是forward和redirect, 有什么区别?
<br>forward是服务器内部重定向，程序收到请求后重新定向到另一个程序，客户机并不知道；
<br>redirect则是服务器收到请求后发送一个状态头给客户，客户将再请求一次，这里多了两次网络通信的来往
<br>forward也有缺点，就是forward的页面的路径如果是相对路径就会有些问题了
<br>
4.	什么是共享锁和排它锁,线程中如何实现?
共享锁就是允许多个线程同时获取一个锁，一个锁可以同时被多个线程拥有。<br>
     排它锁，也称作独占锁，一个锁在某一时刻只能被一个线程占有，其它线程必须等待锁被释放之后才可能获取到锁<br>
<br>