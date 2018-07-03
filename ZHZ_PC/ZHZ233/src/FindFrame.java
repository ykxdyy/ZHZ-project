import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinDef.HWND;

public class FindFrame {
	
	public static boolean judgeWeGameFrame() {
		String windowName = "WeGame";  
        HWND hwnd = User32.INSTANCE.FindWindow(null,windowName);  
        if (hwnd==null) {
        	return false;  
        }
        else {  
            System.out.println("Hit!");  
            boolean showed = User32.INSTANCE.ShowWindow(hwnd, WinUser.SW_RESTORE );  
            System.out.println(windowName+(showed?"����֮ǰ�ɼ�.":"����֮ǰ���ɼ�.")); 
            return true;
        }
	}
	
	public static boolean judgeSteamFrame() {
		String windowName = "Steam ��¼";  
        HWND hwnd = User32.INSTANCE.FindWindow("vguiPopupWindow",windowName);  
        if (hwnd==null) {
        	System.out.println("Miss!"); 
        	JOptionPane.showMessageDialog(new JPanel(), "���Steam", "����",JOptionPane.WARNING_MESSAGE); 
        	return false;
        } else {  
            //System.out.println("Hit!");  
            boolean showed = User32.INSTANCE.ShowWindow(hwnd, WinUser.SW_RESTORE );  
            System.out.println(windowName+(showed?"����֮ǰ�ɼ�.":"����֮ǰ���ɼ�."));  
        } 
        int foreThreadId=User32.INSTANCE.GetWindowThreadProcessId(hwnd,null);//���Steam�ľ��
        System.out.println("���ID:"+foreThreadId);
        //��ȡ��ǰ��Ծ����
        HWND wnd;
        wnd=User32.INSTANCE.GetForegroundWindow();
        int ForeThreadId=User32.INSTANCE.GetWindowThreadProcessId(wnd,null);
        System.out.println("���ID:"+ForeThreadId);
        //�ж�������Ƿ�ΪSteam
        if(foreThreadId==ForeThreadId) {
        	return true;
        }else {
        	return false;
        }
	}
}