package pack2;

public class Student extends Personnel {  //����
    public Student(int number, String name, char sex){
        super(number,name,sex);
    }
    public String toString(){
        return "Student(ѧ����Ϣ):  ������" + name
                + "    ѧ�ţ�" + number + "   �Ա�" + sex ;
    }
    }


