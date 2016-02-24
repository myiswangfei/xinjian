package cn.com.util;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;

public class ExitManager extends Application{
	private List<Activity> activityList=new LinkedList<Activity>();
	   private static ExitManager instance;
//	   我不是乱码呢
	   private ExitManager(){
//		   ÈË¶à
	   }
	   public static ExitManager getInstance(){
		   if (instance==null) {
			instance=new ExitManager();
		}
		   return instance;
	   }
	   public void addActivity(Activity activity){
		   activityList.add(activity);
	   }
	   public void exit(){
		   for(Activity activity:activityList){
			     if(!activity.isFinishing()){
			    	  activity.finish();
			     }
		   }
		   int id=android.os.Process.myPid();
		   if(id!=0){
			   android.os.Process
				.killProcess(id);
		   }
	   }
	   public void kdjdjd(){
	   	// asdjfh lkasjdf lkajsd fkb 
	   	// klj困了就睡的疯狂了敬爱卡松岛枫
	   	// 上课京东方老家狮峰龙井爱妃
	   }
}
