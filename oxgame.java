import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class oxgame{
    public static void main(String args[]){
        int window_height = 400;
        int window_width = 400;
        String title = "oxゲーム";
        window a = new window(title,window_width,window_height);
        a.setResizable(false);//リサイズ禁止
        a.setVisible(true);//ウィンドウ表示


        while(true){

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if(a.judge() == 1){
                a.result();
            }else{
            }
        }

    }
}

class window extends JFrame{
    //ボタンの大きさ
    private int btn_height = 80;
    private int btn_width = 80;
    private int reset_height = 30;
    private int reset_width = 60;
    private int reset_x = 200 - reset_width/2;
    private int reset_y = 340;

    //ボタンに使う画像のファイル名
    private String imgO = "O.jpg";
    private String imgX;
    private ImageIcon iconO = new ImageIcon("./O.jpg");
    private ImageIcon iconX = new ImageIcon("./X.jpg");

    //カウント変数
    public int count = 1;

    //状態管理変数
    private int[][] state = new int[3][3];


    JLabel J = new JLabel("winner");
    JPanel p = new JPanel();

    window(String title, int height, int width){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//閉じるボタンの処理
        setSize(width,height);//ウィンドウサイズ
		setLocationRelativeTo(null);//画面中央に配置

        for(int i = 0; i < 3; i++){//盤面の初期化
            for(int j = 0; j < 3; j++){
                state[i][j] = (i + 1) * (j + 1) + 5;
            }
        }





        JButton[][] btn = new JButton[3][3];//ボタンを格納する配列
        p.setLayout(null);//setBoundsで位置調整可能にする

        //ボタンのインスタンス生成
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                btn[i][j] = new JButton();
                btn[i][j].setBounds(i * 100 + 60,j * 100 + 50,btn_width,btn_height);
                p.add(btn[i][j]);
            }
        }



        btn[0][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[0][0] != 1 && state[0][0] != 2){
                    if(count % 2 == 0){
                        btn[0][0].setIcon(iconX);
                        state[0][0] = 1;
                    }else{
                        btn[0][0].setIcon(iconO);
                        state[0][0] = 2;
                    }

                    count++;
                }

            }
        });


        btn[0][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[0][1] != 1 && state[0][1] != 2){
                    if(count % 2 == 0){
                        btn[0][1].setIcon(iconX);
                        state[0][1] = 1;
                    }else{
                        btn[0][1].setIcon(iconO);
                        state[0][1] = 2;
                    }

                    count++;
                }

            }
        });


        btn[0][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[0][2] != 1 && state[0][2] != 2){
                    if(count % 2 == 0){
                        btn[0][2].setIcon(iconX);
                        state[0][2] = 1;
                    }else{
                        btn[0][2].setIcon(iconO);
                        state[0][2] = 2;
                    }

                    count++;
                }

            }
        });

        btn[1][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[1][0] != 1 && state[1][0] != 2){
                    if(count % 2 == 0){
                        btn[1][0].setIcon(iconX);
                        state[1][0] = 1;
                    }else{
                        btn[1][0].setIcon(iconO);
                        state[1][0] = 2;
                    }

                    count++;

                }
            }
        });

        btn[1][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[1][1] != 1 && state[1][1] != 2){
                    if(count % 2 == 0){
                        btn[1][1].setIcon(iconX);
                        state[1][1] = 1;
                    }else{
                        btn[1][1].setIcon(iconO);
                        state[1][1] = 2;
                    }

                    count++;

                }
            }
        });

        btn[1][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[1][2] != 1 && state[1][2] != 2){
                    if(count % 2 == 0){
                        btn[1][2].setIcon(iconX);
                        state[1][2] = 1;
                    }else{
                        btn[1][2].setIcon(iconO);
                        state[1][2] = 2;
                    }

                    count++;

                }
            }
        });

        btn[2][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[2][0] != 1 && state[2][0] != 2){
                    if(count % 2 == 0){
                        btn[2][0].setIcon(iconX);
                        state[2][0] = 1;
                    }else{
                        btn[2][0].setIcon(iconO);
                        state[2][0] = 2;
                    }

                    count++;

                }
            }
        });

        btn[2][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[2][1] != 1 && state[2][1] != 2){
                    if(count % 2 == 0){
                        btn[2][1].setIcon(iconX);
                        state[2][1] = 1;
                    }else{
                        btn[2][1].setIcon(iconO);
                        state[2][1] = 2;
                    }

                    count++;

                }
            }
        });

        btn[2][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(state[2][2] != 1 && state[2][2] != 2){
                    if(count % 2 == 0){
                        btn[2][2].setIcon(iconX);
                        state[2][2] = 1;
                    }else{
                        btn[2][2].setIcon(iconO);
                        state[2][2] = 2;
                    }

                    count++;

                }
            }
        });

        //リセットボタン追加
        JButton reset = new JButton("reset");
        reset.setBounds(reset_x,reset_y,reset_width,reset_height);
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setTitle("oxゲーム");
                count = 1;
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        btn[i][j].setIcon(null);
                        state[i][j] = (i + 1) * (j + 1) + 5;
                    }
                }
            }
        });


        p.add(reset);

        getContentPane().add(p, BorderLayout.CENTER);//ボタンをウインドウ に追加させる










    }

    int judge(){//３つ揃えたかチェック
        if(state[0][0] == state[0][1] && state[0][1] == state[0][2]){
            return 1;
        }else if(state[1][0] == state[1][1] && state[1][1] == state[1][2]){
            return 1;
        }else if(state[2][0] == state[2][1] && state[2][1] == state[2][2]){
            return 1;
        }else if(state[0][0] == state[1][0] && state[1][0] == state[2][0]){
            return 1;
        }else if(state[0][1] == state[1][1] && state[1][1] == state[2][1]){
            return 1;
        }else if(state[0][2] == state[1][2] && state[1][2] == state[2][2]){
            return 1;
        }else if(state[0][0] == state[1][1] && state[1][1] == state[2][2]){
            return 1;
        }else if(state[0][2] == state[1][1] && state[1][1] == state[2][0]){
            return 1;
        }else{
            return 0;
        }

    }


    void result(){//勝負がついた後にボタンを押せなくする
        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                state[i][j] = 1;
            }
        }
    }




}
