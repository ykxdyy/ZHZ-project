import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HMODULE;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class ces extends JFrame implements Runnable {
	public ces() {
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

	private JPanel contentPane;
	private WinUser.HHOOK hhk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Robot robot = new Robot(); // ����һ��robot����
		// Runtime.getRuntime().exec("notepad"); //��һ�����±�����
		// robot.delay(2000); //�ȴ� 2��
		// �������
		/*
		 * keyPressWithAlt(robot, KeyEvent.VK_SPACE); //���� alt+ �ո� keyPress(robot,
		 * KeyEvent.VK_X); //����x�� robot.delay(1000); //�ȴ� 1�� keyPressString(robot,
		 * "��Һã�����һ��С�����ˣ����кܶ౾���� ��"); //�����ַ��� robot.delay(3000); //�ȴ� 3�� keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� keyPressString(robot,
		 * "���ڣ��Ҿ�����չʾһ��.....����"); //�����ַ��� robot.delay(3000); //�ȴ� 3�� keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� keyPressString(robot,
		 * "���ȣ����ܰ��� ���̵��κ�һ����������,�ҵ�������a,b,c,d��"); //�����ַ��� keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� robot.delay(3000); //�ȴ� 3�� keyPress(robot,
		 * KeyEvent.VK_A); //���� a �� robot.delay(2000); //�ȴ� 2�� keyPress(robot,
		 * KeyEvent.VK_B); //���� b �� robot.delay(2000); //�ȴ� 2�� keyPress(robot,
		 * KeyEvent.VK_C); //���� c �� robot.delay(2000); //�ȴ� 2�� keyPress(robot,
		 * KeyEvent.VK_D); //���� d �� robot.delay(2000); //�ȴ� 2�� keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� keyPressString(robot, "�Ǻǣ�����ˡ�������  ");
		 * robot.delay(3000); //�ȴ� 3�� keyPress(robot, KeyEvent.VK_ENTER); // ���� enter ����
		 * keyPressString(robot, "��������    ���� ���ֺܶ�  �ǲ��� �е� �����أ�����     ������ �������һ�� ");
		 * robot.delay(2000); //�ȴ� 2�� keyPressWithCtrl(robot,KeyEvent.VK_A); //���� ctrl+A
		 * ȫѡ robot.delay(2000); //�ȴ� 2�� keyPress(robot,KeyEvent.VK_DELETE); //���
		 * robot.delay(3000); //�ȴ� 3�� keyPressString(robot,
		 * "�������� �ǲ��� ���� ��ˬ����              ���� �һ��ᰴ ��ϼ��� ..."); keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� robot.delay(3000); //�ȴ� 3��
		 * keyPressString(robot, "................�����Ѿ� ��ʾ���� �� ���Ǻ�    "); keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� robot.delay(3000); //�ȴ� 3��
		 * keyPressString(robot,
		 * "��ʵ���һ��кܶ౾����                           ���ھͲ�����չʾ�� ....."); keyPress(robot,
		 * KeyEvent.VK_ENTER); // ���� enter ���� robot.delay(3000); //�ȴ� 3��
		 * keyPressString(robot, "лл��ң���������");
		 */

		/*
		 * String windowName = "Steam ��¼"; HWND hwnd =
		 * User32.INSTANCE.FindWindow("vguiPopupWindow",windowName); if
		 * (hwnd==null)System.out.println("Miss!"); else { System.out.println("Hit!");
		 * boolean showed = User32.INSTANCE.ShowWindow(hwnd, WinUser.SW_RESTORE );
		 * System.out.println(windowName+(showed?"����֮ǰ�ɼ�.":"����֮ǰ���ɼ�.")); } int
		 * foreThreadId=User32.INSTANCE.GetWindowThreadProcessId(hwnd,null);
		 * System.out.println("ces���ID:"+foreThreadId); robot.delay(3000); HWND wnd;
		 * wnd=User32.INSTANCE.GetForegroundWindow(); int
		 * ForeThreadId=User32.INSTANCE.GetWindowThreadProcessId(wnd,null);
		 * System.out.println("ces���ID:"+ForeThreadId);
		 */

		// ���̹���
		/*
		 * ces kh = new ces(); new Thread(kh).start();
		 */

		// ִ��CMD����
		
		/* String command="ipconfig -all"; 
		 String s="IPv4"; 
		 String line = null;
		 StringBuilder sb = new StringBuilder();
		 Runtime runtime = Runtime.getRuntime();//���Java����ʱ���� 
		 try { 
			 Process process = runtime.exec(command);//ִ��CMD���� 
			 BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(process.getInputStream())));
			 while ((line = bufferedReader.readLine()) != null) {
				 sb.append(line + "\n");
			 }
			 if (line.contains(s)) {
				 System.out.println(line); 
			 }
		 }catch (IOException e){ // TODO �Զ����ɵ� catch �� 
			 e.printStackTrace();
		  }*/
		 

		// ���Զ�ʱ����1
		/*
		 * String job_name = "��̬�������"; System.out.println("��������������ʼ(ÿ10�����һ��)...");
		 * QuartzManager.addJob(job_name, QuartzJob.class, "0/10 * * * * ?");
		 */

		// ��ʱ�����߳�ģʽ
		/*QuartzDoing rescue = new QuartzDoing("2018052903000000000002");
		new Thread(rescue).start();*/
        
        //�Ƚ�Data�Ĵ�С
		/*String DateStr1 = "2011-10-1 10:20:16";  
		String DateStr2 = "2011-10-07 15:50:35";  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date dateTime1 = dateFormat.parse(DateStr1);  
		Date dateTime2 = dateFormat.parse(DateStr2);  
		int i = dateTime2.compareTo(dateTime1);   
		System.out.println(i);   */
		
		/*
		 * robot.delay(3000); //�ȴ� 3�� int kye[][] = new int[2][2]; kye[0][0] = 72;
		 * kye[0][1] = 73; kye[1][0] = 74; kye[1][1] = 75;
		 * 
		 * System.out.println(Win32Util.simulateKeyboardEvent(hwnd, kye));
		 */

		/*
		 * Schedul4399Utils Utils = new Schedul4399Utils();
		 * Utils.Schedul4399("binbin201806", "QQ109ZL2");
		 */
	}

	//����ر�ǰִ�У�����رչ��ӣ�
	static class ShutdownCallbackThread extends Thread {
		public void run() {
			System.out.println("����Ҫ�ر���");
		}// ���ùرշ�ֵ
	}

	// shift+ ����
	public static void keyPressWithShift(Robot r, int key) {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(key);
		r.keyRelease(key);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.delay(100);
	}

	// ctrl+ ����
	public static void keyPressWithCtrl(Robot r, int key) {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(key);
		r.keyRelease(key);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(100);
	}

	// alt+ ����
	public static void keyPressWithAlt(Robot r, int key) {
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(key);
		r.keyRelease(key);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(100);
	}

	// ��ӡ���ַ���
	public static void keyPressString(Robot r, String str) {
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();// ��ȡ���а�
		Transferable tText = new StringSelection(str);
		clip.setContents(tText, null); // ���ü��а�����
		keyPressWithCtrl(r, KeyEvent.VK_V);// ճ��
		r.delay(100);
	}

	// ���� ����
	public static void keyPress(Robot r, int key) {
		r.keyPress(key);
		r.keyRelease(key);
		r.delay(100);
	}

	// ����������ӡ�ַ���
	public static void keyMyPressString(Robot r, String str) {

		r.keyPress(MyKeyEvent.VK_0);
		r.keyRelease(MyKeyEvent.VK_0);
		r.delay(100);

	}

	/**
	 * 
	 * 
	 */

	// ���ӻص�����
	private WinUser.LowLevelKeyboardProc keyboardProc = new WinUser.LowLevelKeyboardProc() {
		@Override
		public LRESULT callback(int nCode, WPARAM wParam, WinUser.KBDLLHOOKSTRUCT event) {
			// �������ֵ�Ͱ���ʱ��
			if (nCode >= 0) {
				String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
				System.out.println(time + " KEY: " + event.vkCode);
				Robot robot;
				try {
					robot = new Robot();
					if (event.vkCode == 72)
						keyPress(robot, 72);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// ����ESC�˳�
				if (event.vkCode == 27)
					setHookOff();
			}
			return User32.INSTANCE.CallNextHookEx(hhk, nCode, wParam, null);
		}
	};// MyBlog @See http://blog.csdn.net/shenpibaipao

	public void run() {
		setHookOn();
	}

	// ��װ����
	public void setHookOn() {
		System.out.println("Hook On!");

		HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
		hhk = User32.INSTANCE.SetWindowsHookEx(User32.WH_KEYBOARD_LL, keyboardProc, hMod, 0);

		int result;
		WinUser.MSG msg = new WinUser.MSG();
		while ((result = User32.INSTANCE.GetMessage(msg, null, 0, 0)) != 0) {
			if (result == -1) {
				setHookOff();
				break;
			} else {
				User32.INSTANCE.TranslateMessage(msg);
				User32.INSTANCE.DispatchMessage(msg);
			}
		}
	}

	// �Ƴ����Ӳ��˳�
	public void setHookOff() {
		System.out.println("Hook Off!");
		User32.INSTANCE.UnhookWindowsHookEx(hhk);
		System.exit(0);
	}

}