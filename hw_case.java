import java.util.Scanner;
public class hw_case {
    public static void main(String[] args){
        /*
--------������� �����-------------------------------------------------------------------------
--------�� ���������� ��� �������� ��������� ����� ���������� ������ "?"------------------------
         */
        Scanner in=new Scanner(System.in);
        //Case1. ���� ����� ����� � ��������� 1�7. ������� ������ � �������� ���
        //������, ��������������� ������� ����� (1 � ������������, 2 � �������� � �. �.).
        /*
        System.out.print("������� ����� ��� ������: ");
        int day=in.nextInt();
        switch(day){
            case 1:
                System.out.println("�����������");
                break;
            case 2:
                System.out.println("�������");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("�������");
                break;
            case 5:
                System.out.println("�������");
                break;
            case 6:
                System.out.println("�������");
                break;
            case 7:
                System.out.println("�����������");
                break;
            default:
                System.out.println("��� ������ ��� ������");
                break;
         */
        /*
-----------------------------------------------------------------------------------------
         */
        //Case2. ���� ����� ����� K.
        //������� ������-�������� ������, ��������������� ����� K (1 � ������, 2 � ��������������������,
        //3 � ������������������, 4 � �������, 5 � ��������). ���� K �� ����� � ��������� 1�5,
        //�� ������� ������ �������.
        /*
        System.out.print("��������� ������ �� 1 �� 5: ");
        int num=in.nextInt();
        switch (num){
            case 1:
                System.out.println("�����");
                break;
            case 2:
                System.out.println("�������������������");
                break;
            case 3:
                System.out.println("�����������������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("�������");
                break;
            default:
                System.out.println("������");
        }
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Case3. ��� ����� ������ � ����� ����� � ��������� 1�12 (1 � ������, 2 � ������� � �. �.).
        //������� �������� ���������������� ������� ���� (�����,
        //������, �����, �������).
        /*
        System.out.println("������� ����� ������: ");
        int month= in.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
        */
        /*
-------------------------------------------------------------------------------------
         */
        //Case4. ��� ����� ������ � ����� ����� � ��������� 1�12 (1 � ������, 2 �
        //������� � �. �.). ���������� ���������� ���� � ���� ������ ��� ������������� ����.
        /*
        System.out.println("������� ����� ������: ");
        int month= in.nextInt();
        switch (month){
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
        }
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //Case5. �������������� �������� ��� ������� ������������� ���������
        //�������: 1 � ��������, 2 � ���������, 3 � ���������, 4 � �������. ���
        //����� �������� N (����� ����� � ��������� 1�4) � ������������ ����� A
        //� B (� �� ����� 0). ��������� ��� ������� ��������� �������� � �������
        //���������
        /*
        System.out.print("Enter number A: ");
        int a=in.nextInt();
        System.out.print("Enter number B: ");
        int b=in.nextInt();
        System.out.println("Enter action number(1-4): ");
        int n=in.nextInt();
        int res=0;
        switch (n){
            case 1:
                res=a+b;
                break;
            case 2:
                res=a-b;
                break;
            case 3:
                res=a*b;
                break;
            case 4:
                res=a/b;
                break;
        }
        System.out.println(res);
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //Case6. ������� ����� ������������� ��������� �������: 1 � ��������,
        //2 � ��������, 3 � ����, 4 � ���������, 5 � ���������. ��� �����
        //������� ����� (����� ����� � ��������� 1�5) � ����� ������� � ����
        //�������� (������������ �����). ����� ����� ������� � ������.
        /*
        System.out.print("Enter unit number: ");
        int num= in.nextInt();
        System.out.print("Enter the number: ");
        int a=in.nextInt();
        switch (num){
            case 1:
                System.out.println(a+" decimeter = "+a*10+" meters");
                break;
            case 2:
                System.out.println(a+" kilometer = "+a*1000+" meters");
                break;
            case 3:
                System.out.println(a+" meters");
                break;
            case 4:
                System.out.println(a+" millimeter = "+a/(double)1000+" meters");
                break;
            case 5:
                System.out.println(a+" centimeter = "+a/(double)10+" meters");
                break;
        }
        */
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case8. ���� ��� ����� �����: D (����) � M (�����),
        //������������ ���������� ���� ������������� ����.
        //������� �������� D � M ��� ����,
        //�������������� ���������.
        /*
        System.out.println("Enter data (day and month)");
        System.out.print("Day: ");
        int day=in.nextInt();
        System.out.print("Month: ");
        int month=in.nextInt();
        day=day-1;
        if(day==0){
            month=month-1;
            if(month==0){
                month=12;
            }
            switch (month){
                case 1:
                    day=31;
                    break;
                case 2:
                    day=28;
                    break;
                case 3:
                    day=31;
                    break;
                case 4:
                    day=30;
                    break;
                case 5:
                    day=31;
                    break;
                case 6:
                    day=30;
                    break;
                case 7:
                    day=31;
                    break;
                case 8:
                    day=31;
                    break;
                case 9:
                    day=30;
                    break;
                case 10:
                    day=31;
                    break;
                case 11:
                    day=30;
                    break;
                case 12:
                    day=31;
                    break;
            }
        }
        System.out.println("Yesterday was "+day+" month "+month);
        */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Case9. ���� ��� ����� �����: D (����) � M (�����),
        //������������ ���������� ���� ������������� ����.
        //������� �������� D � M ��� ����, ��������� �� ���������.
        /*
        System.out.println("Enter data (day and month)");
        System.out.print("Day: ");
        int day=in.nextInt();
        System.out.print("Month: ");
        int month=in.nextInt();
        int dim=0;
        day=++day;
        switch (month){
            case 1:
                dim=31;
                break;
            case 2:
                dim=28;
                break;
            case 3:
                dim=31;
                break;
            case 4:
                dim=30;
                break;
            case 5:
                dim=31;
                break;
            case 6:
                dim=30;
                break;
            case 7:
                dim=31;
                break;
            case 8:
                dim=31;
                break;
            case 9:
                dim=30;
                break;
            case 10:
                dim=31;
                break;
            case 11:
                dim=30;
                break;
            case 12:
                dim=31;
                break;
        }
        if(day>dim){
            day=1;
            ++month;
        }
        System.out.println("Tomorrow will be "+day+" day "+month+" month");
        */
        /*
-------------------------------------------------------------------------------------------
         */
        //Case10. ����� ����� ������������ � ������� ������������ (�ѻ � �����,
        //�ǻ � �����, �޻ � ��, �» � ������) � ��������� ��� �������� �������:
        //0 � ���������� ��������, 1 � ������� ������, ?1 � �������
        //�������. ��� ������ C � �������� ����������� ������ � ����� ����� N � ��������� ��� �������.
        //������� ����������� ������ ����� ���������� ���������� �������
        /*
        System.out.print("������� �������� �������e���: ");
        char napravlenie=in.next().charAt(0);
        System.out.print("������� �������: ");
        int com = in.nextInt();
        switch (napravlenie){
            case '�':
                switch (com){
                    case 0:
                        System.out.println("����� ���������� �� ��");
                        break;
                    case 1:
                        System.out.println("����� ���������� �� ������");
                        break;
                    case -1:
                        System.out.println("����� ���������� �� �����");
                        break;
                }
                break;
            case '�':
                switch (com){
                    case 0:
                        System.out.println("����� ���������� �� �����");
                        break;
                    case 1:
                        System.out.println("����� ���������� �� ��");
                        break;
                    case -1:
                        System.out.println("����� ���������� �� �����");
                        break;
                }
                break;
            case '�':
                switch (com){
                    case 0:
                        System.out.println("����� ���������� �� �����");
                        break;
                    case 1:
                        System.out.println("����� ���������� �� �����");
                        break;
                    case -1:
                        System.out.println("����� ���������� �� ������");
                        break;
                }
                break;
            case '�':
                switch (com){
                    case 0:
                        System.out.println("����� ���������� �� ������");
                        break;
                    case 1:
                        System.out.println("����� ���������� �� �����");
                        break;
                    case -1:
                        System.out.println("����� ���������� �� ��");
                        break;
                }
                break;
        }
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Case11. ������� ������������ �� ���� �� ������ ����� (�ѻ � �����, �ǻ �
        //�����, �޻ � ��, �» � ������) � ����� ��������� ��� �������� ������� ��������:
        //1 � ������� ������, ?1 � ������� �������, 2 � ������� �� 180?.
        //��� ������ C � �������� ���������� �������� � ����� ����� N1
        //� N2 � ��� ��������� �������. ������� ���������� �������� �����
        //���������� ���� ������.
        /*
        System.out.print("������� �������� �����������: ");
        char c=in.next().charAt(0);
        if (c=='�'||c=='�'||c=='�'||c=='�') {
            System.out.print("������� ������� 1: ");
            int n1 = in.nextInt();
            if (n1 > 2 || n1 < -1 || n1 == 0) {
                System.out.println("�������� �������");
            } else {
                System.out.print("������� ������� 2: ");
                int n2 = in.nextInt();
                if (n2 > 2 || n2 < -1 || n2 == 0) {
                    System.out.println("�������� �������");
                } else {
                    int com = n1 + n2;
                    if (com == 4) {
                        com = 0;
                    }
                    switch (c) {
                        case '�':
                            switch (com) {
                                case 0:
                                    System.out.println("��");
                                    break;
                                case 1:
                                    System.out.println("�����");
                                    break;
                                case 2:
                                    System.out.println("�����");
                                    break;
                                case 3:
                                    System.out.println("������");
                                    break;
                            }
                            break;
                        case '�':
                            switch (com) {
                                case 0:
                                    System.out.println("�����");
                                    break;
                                case 1:
                                    System.out.println("�����");
                                    break;
                                case 2:
                                    System.out.println("������");
                                    break;
                                case 3:
                                    System.out.println("��");
                                    break;
                            }
                            break;
                        case '�':
                            switch (com) {
                                case 0:
                                    System.out.println("�����");
                                    break;
                                case 1:
                                    System.out.println("������");
                                    break;
                                case 2:
                                    System.out.println("��");
                                    break;
                                case 3:
                                    System.out.println("�����");
                                    break;
                            }
                            break;
                        case '�':
                            switch (com) {
                                case 0:
                                    System.out.println("������");
                                    break;
                                case 1:
                                    System.out.println("��");
                                    break;
                                case 2:
                                    System.out.println("�����");
                                    break;
                                case 3:
                                    System.out.println("�����");
                                    break;
                            }
                            break;
                    }
                }
            }
        }
        else {
            System.out.println("�������� ��������");
        }
         */
        /*
--------------------------------------------------------------------------------------------------
         */
        //Case12. �������� ���������� ������������� ��������� �������:
        //1 � ������ R, 2 � ������� D = 2�R, 3 � ����� L = 2�?�R, 4 � ������� ����� S = ?�R^2.
        //��� ����� ������ �� ���� ��������� � ��� ��������. �������
        //�������� ��������� ��������� ������ ���������� (� ��� �� �������).
        //� �������� �������� ? ������������ 3.14.
        /*
        final double pi = 3.14;
        System.out.print("������� ����� 1-4: ");
        int num = in.nextInt();
        double r = 0;
        double d = 0;
        double l = 0;
        double s = 0;
        switch (num){
            case 1:
                System.out.print("������� R: ");
                r = in.nextInt();
                d = 2*r;
                l = 2*pi*r;
                s = pi*(r*r);
                break;
            case 2:
                System.out.print("������� D: ");
                d = in.nextInt();
                r = d/2;
                l = 2*pi*r;
                s = pi*(r*r);
                break;
            case 3:
                System.out.print("������� L: ");
                l = in.nextInt();
                r = l/(2*pi);
                d = 2*r;
                s = pi*(r*r);
                break;
            case 4:
                System.out.print("������� S: ");
                s = in.nextInt();
                r = s/pi;
                r = Math.sqrt(r);
                d = 2*r;
                l = 2*pi*r;
                break;
        }
        System.out.println("R="+r+"\nD="+d+"\nL="+l+"\nS="+s);
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //Case13. �������� ��������������� �������������� ������������ ������������� ��������� �������:
        //1 � ����� a, 2 � ���������� c = a�?2, 3 � ������ h, ��������� �� ���������� (h = c/2), 4 � ������� S = c�h/2.
        //��� ����� ������ �� ���� ��������� � ��� ��������. ������� ��������
        //��������� ��������� ������� ������������ (� ��� �� �������).
        /*
---------------------------------------------------------------------------------------------
         */
        //Case14. �������� ��������������� ������������ ������������� ��������� �������:
        //1 � ������� a, 2 � ������ R1 ��������� ����������(R1 = a�?3/6),
        //3 � ������ R2 ��������� ���������� (R2 = 2�R1), 4 � ������� S = a^2�?3/4.
        //��� ����� ������ �� ���� ��������� � ��� ��������.
        //������� �������� ��������� ��������� ������� ������������ (� ��� �� �������).
        /*
---------------------------------------------------------------------------------------------
         */
        //Case15. ������ ��������� ���� ��������� ���������� ������: 1 � ����,
        //2 � �����, 3 � �����, 4 � �����. ����������� ����, ������� �������,
        //��������� ������: 11 � �����, 12 � ����, 13 � ������, 14 � ���. ����
        //��� ����� �����: N � ����������� (6 ? N ? 14) � M � ����� �����
        //(1 ? M ? 4). ������� �������� ��������������� ����� ���� ���������
        //�����, ����� ������, ���� ����� � �. �.
        /*
        System.out.print("������� ����� �����: ");
        int m = in.nextInt();
        System.out.println("������� ����������� �����: ");
        int d = in.nextInt();
        String test = "0";
        switch (m){
            case 1:
                test = "���";
                break;
            case 2:
                test = "����";
                break;
            case 3:
                test = "�����";
                break;
            case 4:
                test = "������";
                break;
        }
        String test2 = "0";
        switch (d){
            case 6:
                test2 = "�����";
                break;
            case 7:
                test2 = "����";
                break;
            case 8:
                test2 = "������";
                break;
            case 9:
                test2 = "������";
                break;
            case 10:
                test2 = "������";
                break;
            case 11:
                test2 = "�����";
                break;
            case 12:
                test2 = "����";
                break;
            case 13:
                test2 = "������";
                break;
            case 14:
                test2 = "���";
                break;
        }
        System.out.println(test2+" "+test);
         */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //Case16. ���� ����� ����� � ��������� 20�69, ������������ ������� (� �����).
        //������� ������-�������� ���������� ��������, ��������� ���������� ������������ ����� �� ������ ����,
        //��������: 20 � ��������� ���, 32 � ��������� ��� ����, 41 � ������ ���� ���.
        /*
        System.out.print("������� ����� ������������ ������� (20-69): ");
        int year = in.nextInt();
        int des = year / 10;
        String des1 = " ";
        String ed1 = " ";
        String year1 = " ";
        int ed = year % 10;
        if (year < 20 || year > 69){
            System.out.println("������ �������� �������");
        }
        else {
            switch (des){
                case 2:
                    des1 = "��������";
                    break;
                case 3:
                    des1 = "��������";
                    break;
                case 4:
                    des1 = "�����";
                    break;
                case 5:
                    des1 = "���������";
                    break;
                case 6:
                    des1 = "����������";
                    break;
            }
            switch (ed){
                case 1:
                    ed1 = "����";
                    break;
                case 2:
                    ed1 = "���";
                    break;
                case 3:
                    ed1 = "���";
                    break;
                case 4:
                    ed1 = "������";
                    break;
                case 5:
                    ed1 = "����";
                    break;
                case 6:
                    ed1 = "�����";
                    break;
                case 7:
                    ed1 = "����";
                    break;
                case 8:
                    ed1 = "������";
                    break;
                case 9:
                    ed1 = "������";
                    break;
                default:
                    break;
            }
        }
        if (ed == 1){
            year1 = "���";
        }
        else {
            if (ed > 1 && ed < 5){
                year1 = "����";
            }
            else {
                if (ed > 4 && ed < 10 || ed == 0){
                    year1 = "���";
                }
            }
        }
        if (year%10==0) {
            System.out.println(des1 + " " + year1);
        }
        else {
            System.out.println(des1 + " " + ed1 + " " + year1);
        }
        */
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case17. ���� ����� ����� � ��������� 10�40, ������������ ���������� ������� ������� �� ��������� ����.
        //������� ������-�������� ���������� ���������� �������,
        //��������� ���������� ������������ ����� �� ������� �������� �������, ��������:
        //18 � ������������� ������� �������, 23 � ��������� ��� ������� ��������, 31 � ��������� ���� ������� �������.
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case18. ���� ����� ����� � ��������� 100�999. ������� ������-��������
        //������� �����, ��������: 256 � ������� ��������� ������, 814 � ���������� �������������.
        /*
        System.out.print("������� ����� � ��������� 100-999: ");
        int num = in.nextInt();
        int hundreds = num/100;
        int tens = num%100/10;
        int units = num%100%10;
        switch (hundreds){
            case 1:
                System.out.print("��� ");
                break;
            case 2:
                System.out.print("������ ");
                break;
            case 3:
                System.out.print("������ ");
                break;
            case 4:
                System.out.print("��������� ");
                break;
            case 5:
                System.out.print("������� ");
                break;
            case 6:
                System.out.print("�������� ");
                break;
            case 7:
                System.out.print("������� ");
                break;
            case 8:
                System.out.print("��������� ");
                break;
            case 9:
                System.out.print("��������� ");
                break;
        }
        if (num%100>9&&num%100<20){
            switch (units){
                case 0:
                    System.out.println("������");
                    break;
                case 1:
                    System.out.println("����������");
                    break;
                case 2:
                    System.out.println("����������");
                    break;
                case 3:
                    System.out.println("����������");
                    break;
                case 4:
                    System.out.println("������������");
                    break;
                case 5:
                    System.out.println("����������");
                    break;
                case 6:
                    System.out.println("�����������");
                    break;
                case 7:
                    System.out.println("����������");
                    break;
                case 8:
                    System.out.println("������������");
                    break;
                case 9:
                    System.out.println("������������");
                    break;
            }
        }
        else {
            switch (tens) {
                case 2:
                    System.out.print("�������� ");
                    break;
                case 3:
                    System.out.print("�������� ");
                    break;
                case 4:
                    System.out.print("����� ");
                    break;
                case 5:
                    System.out.print("��������� ");
                    break;
                case 6:
                    System.out.print("���������� ");
                    break;
                case 7:
                    System.out.print("��������� ");
                    break;
                case 8:
                    System.out.print("����������� ");
                    break;
                case 9:
                    System.out.print("��������� ");
                    break;
            }
            switch (units) {
                case 1:
                    System.out.print("����");
                    break;
                case 2:
                    System.out.print("���");
                    break;
                case 3:
                    System.out.print("���");
                    break;
                case 4:
                    System.out.print("������");
                    break;
                case 5:
                    System.out.print("����");
                    break;
                case 6:
                    System.out.print("�����");
                    break;
                case 7:
                    System.out.print("����");
                    break;
                case 8:
                    System.out.print("������");
                    break;
                case 9:
                    System.out.print("������");
                    break;
            }
        }
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Case19. � ��������� ��������� ������ 60-������ ����, ��������� �� 12-
        //������ ���������, ������������ ���������� �����: �������, �������,
        //������, ����� � ������. � ������ �������� ���� ����� �������� ��������:
        //�����, ������, �����, �����, �������, ����, ������, ����, ��������,
        //������, ������ � ������. �� ������ ���� ���������� ��� ��������, ����
        //1984 ��� � ������ �����: ���� ������� ������.
        /*
        System.out.print("����������� ������ ���������� ���������. \n������� ���: ");
        int year = in.nextInt();
        if(year<-2697){
            System.out.println("���������� ���� ��� � ��������� ���������.");
        }
        else {
            final int YEAR = 1984;                      //����� �������: ������ ��� ������� ��������
            int god = Math.abs(year - YEAR);           //���������� ��� ��/�� ����� �������
            int num = god % 60;                         //��� � �����. 0 - 60��(���������) ��� �����
            int color = num / 12;                      //����� �����
            int animal = num % 12;                    //����� ��������� � ��������
            if (year < YEAR && animal != 0) {
                animal = 12 - animal;                       //��� �������� ���� ����� 1984
                if (color != 0) {
                    color = 4 - color;
                }
            }
            System.out.print("��� ");
            switch (color) {
                case 0:
                    if (animal > 1 && animal < 5) {
                        System.out.print("�������� ");
                    } else {
                        System.out.print("������� ");
                    }
                    break;
                case 1:
                    if (animal > 1 && animal < 5) {
                        System.out.print("�������� ");
                    } else {
                        System.out.print("������� ");
                    }
                    break;
                case 2:
                    if (animal > 1 && animal < 5) {
                        System.out.print("������� ");
                    } else {
                        System.out.print("������ ");
                    }
                    break;
                case 3:
                    if (animal > 1 && animal < 5) {
                        System.out.print("������ ");
                    } else {
                        System.out.print("����� ");
                    }
                    break;
                case 4:
                    if (animal > 1 && animal < 5) {
                        System.out.print("������� ");
                    } else {
                        System.out.print("������ ");
                    }
                    break;
            }
            switch (animal) {
                case 0:
                    System.out.println("�����");
                    break;
                case 1:
                    System.out.println("������");
                    break;
                case 2:
                    System.out.print("�����");
                    break;
                case 3:
                    System.out.print("�����");
                    break;
                case 4:
                    System.out.print("�������");
                    break;
                case 5:
                    System.out.print("����");
                    break;
                case 6:
                    System.out.print("������");
                    break;
                case 7:
                    System.out.print("����");
                    break;
                case 8:
                    System.out.print("��������");
                    break;
                case 9:
                    System.out.print("������");
                    break;
                case 10:
                    System.out.print("������");
                    break;
                case 11:
                    System.out.print("������");
                    break;
            }
        }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Case20. ���� ��� ����� �����: D (����) � M (�����), ������������ ���������� ����.
        //������� ���� �������, ��������������� ���� ����: �������� (20.1�18.2),
        //������ (19.2�20.3), ����� (21.3�19.4), ������� (20.4�20.5), ���������� (21.5�21.6),
        //���� (22.6�22.7), ���� (23.7�22.8), ����� (23.8�22.9), ������ (23.9�22.10),
        //��������� (23.10�22.11), ��������� (23.11�21.12), �������� (22.12�19.1).
        System.out.print("����������� ������� ����� ������. \n������� ����: ");
        int day = in.nextInt();
        System.out.print("������� �����: ");
        int month = in.nextInt();
        switch (month){
            case 1:
                if(day<20) {
                    System.out.println("�������");
                }
                else {
                    System.out.println("�������");
                }
                break;
            case 2:
                if(day<19){
                    System.out.println("�������");
                }
                else {
                    System.out.println("����");
                }
                break;
            case 3:
                if(day<21){
                    System.out.println("����");
                }
                else {
                    System.out.println("����");
                }
                break;
            case 4:
                if(day<20){
                    System.out.println("����");
                }
                else {
                    System.out.println("�����");
                }
                break;
            case 5:
                if(day<21){
                    System.out.println("�����");
                }
                else {
                    System.out.println("��������");
                }
                break;
            case 6:
                if(day<22){
                    System.out.println("��������");
                }
                else {
                    System.out.println("���");
                }
                break;
            case 7:
                if(day<23) {
                    System.out.println("���");
                }
                else {
                    System.out.println("���");
                }
                break;
            case 8:
                if(day<23){
                    System.out.println("���");
                }
                else{
                    System.out.println("����");
                }
                break;
            case 9:
                if(day<23){
                    System.out.println("����");
                }
                else {
                    System.out.println("����");
                }
                break;
            case 10:
                if(day<23){
                    System.out.println("����");
                }
                else {
                    System.out.println("��������");
                }
                break;
            case 11:
                if(day<23){
                    System.out.println("��������");
                }
                else {
                    System.out.println("�������");
                }
                break;
            case 12:
                if(day<22){
                    System.out.println("�������");
                }
                else {
                    System.out.println("�������");
                }
                break;
        }
    }
}