package pack2;

public class Courses {
    int number;
    String Coursesname;
    String place;
    float time;
    float score;

    public Courses(String coursesname, int number, String place, float time, float score) {
        this.Coursesname = coursesname;
        this.number = number;
        this.place = place;
        this.time = time;
        this.score = score;
    }

    public String toString() {
        return Coursesname+    "(�γ���Ϣ)" + "     �γ̱�ţ�" + number + "   �Ͽεص㣺" + place
                + "    �γ�ʱ�䣺" + time + "Сʱ" + "     �γ�ѧ�֣�" + score + "��";
    }
}