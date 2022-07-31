package com.dsa.solution.backtracking;

public class MatchsticksToSquare {
    public static void main(String[] args) {
        int[] matchsticks = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        MatchsticksToSquare obj = new MatchsticksToSquare();
        System.out.println( obj.makesquare(matchsticks));

    }

    public boolean makesquare(int[] matchsticks) {

        if (matchsticks.length < 4) {
            return false;
        }

        int perimeter = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            perimeter += matchsticks[i];
        }

        if (perimeter % 4 != 0) {
            return false;
        }
        int side = perimeter / 4;
        int[] sides = {side, side, side, side};
        return formSquare(matchsticks, 0, sides);

    }

    public boolean formSquare(int[] nums, int i, int[] sides) {

        if (i == nums.length) {
            if(sides[0] == 0 && sides[1] == 0 && sides[2] == 0 && sides[3] == 0){
                return true;

            }else{
                return false;
            }
        }


        for (int j = 0; j < 4; j++) {
            if (nums[i] > sides[j]) {
                continue;
            }
            sides[j] -= nums[i];
            if (formSquare(nums, i + 1, sides)) {
                return true;
            }
            sides[j] += nums[i];
        }

        return false;
    }
}
