# Java第三次实验——学生选课模拟系统
## 一、实验目的
#### （1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
#### （2）掌握面向对象的类设计方法（属性、方法）；
#### （3）掌握类的继承用法，通过构造方法实例化对象；
#### （4）学会使用super()，用于实例化子类；
#### （5）掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 业务要求
#### 说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
##### 对象：	
###### 人员（编号、姓名、性别）
###### 教师（编号、姓名、性别、所授课程）
###### 学生（编号、姓名、性别、所选课程）
###### 课程（编号、课程名称、上课地点、时间、授课教师）
## 三、实验要求
#### 1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
#### 2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
#### 3.编写实验报告。
## 四、核心代码
```
import java.util.Scanner;     //主要功能是简化文本扫描、获取控制台输入
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Courses a = null ;      //对a进行初始化赋值
        Student w = new Student(2019310639, "陈仁众", 'M');
        System.out.println("学生信息");
        System.out.println(w);
        Teacher b = new Teacher(1, "王", 'M', "数学");
        Teacher c = new Teacher(2, "李", 'M', "化学");
        Teacher d = new Teacher(3, "张", 'W', "英语");
        System.out.println("教师信息");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Courses e = new Courses("数学", 7, "101", 2, 2);
        Courses f = new Courses("英语", 8, "102", 2, 3);
        Courses g = new Courses("化学", 9, "103", 2, 4);
        System.out.println("课程信息");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("请输入1,2,3进行选课: ");
        int x = in.nextInt();        // Scanner 类来获取用户的输入
        if (x == 1) {
            a = e;
            System.out.println("已选课: " + e);
            System.out.println(b);
        } else if (x == 2) {
            a = f;
            System.out.println("已选课: " + f);
            System.out.println(c);
        } else if (x == 3) {
            a = g;
            System.out.println("已选课: " + g);
            System.out.println(d);
        } else {
            System.out.println("未查到课程");
        }

        System.out.println(w);
        System.out.println("已选课程  "+a);


        System.out.println("请输入1,2,3进行退课: ");
        int y = in.nextInt();

        while (x == 1)       // 确保只能退已选课程
            if (y == 1) {
                a = e;
                System.out.println("已退课: " + e);
                System.out.println(b);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (x == 2)
            if (y == 2) {
                a = f;
                System.out.println("已退课: " + f);
                System.out.println(c);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (x == 3)
            if (y == 3) {
                a = g;
                System.out.println("已退课: " + g);
                System.out.println(d);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

    }
}
```
## 六、实验过程
#### 1.确定Personnel为父类，Teacher和Student为子类， 用extends继承父类的属性和方法
#### 2.确定每个类所拥有的属性并依据属性类型定义为整型，字符型等
#### 3.利用super函数调用父类的构造方法，实例化子类
#### 4.用this关键字给每一个变量传递它们的值
#### 5.在父类Personnel和Courses类里利用toString来返回字符串本身，生成的值可以很直观的看出内容
#### 6. 利用Scanner来获取用户的输入，跟if一起实现判断选课和退课的操作，利用while和break对于退课环节加深处理，只能退已选课程
#### 7.最后把所有需要的信息输出出来
## 七、实验结果
![实验结果](https://github.com/penny0203/java2/blob/main/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202020-10-25%20224233.png)

## 八、编程感想
#### 在选课退课环节对于if循环函数加深了了解，尤其是使用循环函数时一定要注意break函数的使用。



# java2
