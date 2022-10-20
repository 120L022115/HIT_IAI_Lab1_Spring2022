package app;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Window{
	private JFrame window;
	private JTextArea export;
	private StringBuilder str = new StringBuilder();
	public Window() {
		window = new JFrame("智能的猴子 - AI LAB1 - 120L022115");
		window.setVisible(true);
		window.setSize(400, 400);//设置大小
		window.setLocationRelativeTo(null);//设置居中
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可关闭
		window.setLayout(null);//设置绝对布局（窗口里面的内容不会随着窗口的改变而改变）
		window.setResizable(false);//设置窗口不可拉伸改变大小
		//设置文本框
		export = new JTextArea();
		export.setEditable(false);
		export.setBounds(0, 0, 400, 400);
		window.add(export);
	}
	public void add(String s) {
		str.append(s);
		export.setText(str.toString());
	}
}
