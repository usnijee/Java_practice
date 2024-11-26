package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId:ZoneId.getAvailableZoneIds()) {
//            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();  // 시스템이 사용하는 기본 ZoneId
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul"); // 타임존을 직접 제공해서 ZoneId를 반환
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
