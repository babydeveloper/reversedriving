

public class DrivingInterface {
	public native int OpenSharedMemory();
	public native int ReadSharedMemory(double[] driveArray, double[] aicarArray, double[] trackArray, double[] damageArray, int[] rankArray, int[] trackCurveType, double[] trackAngleArray, double[] trackDistArray, double[] trackCurrentAngle);
	public native int WriteSharedMemory(double steer, double accel, double brake, int backward);
	static{
		System.loadLibrary("DrivingInterfaceLib");
	}
	
	// array size
	public static int INPUT_DRIVE_SIZE = 3;
	public static int INPUT_AICAR_SIZE = 20;
	public static int INPUT_TRACK_SIZE = 4; // except track_curve_type
	public static int INPUT_FORWARD_TRACK_SIZE = 20;
	public static int INPUT_DAMAGE_SIZE = 2;
	public static int INPUT_RANK_SIZE = 3;
	
	// array index
	public static int drvie_toMiddle = 0;
	public static int drvie_angle = 1;
	public static int drvie_speed = 2;

	public static int track_toStart = 0;
	public static int track_dist_track = 1;
	public static int track_width = 2;
	public static int track_dist_straight = 3;
	
	public static int damage= 0;
	public static int damage_max = 1;
	
	public static int rank_total_car_num = 0;
	public static int rank_my_rank = 1;
	public static int rank_opponent_rank = 2;
	
	// backward value
	public static int gear_type_forward = 0;
	public static int gear_type_backward = -1;
}
