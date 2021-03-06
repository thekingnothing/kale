/*
 *   Copyright 2017 Arthur Zagretdinov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.thekingnothing.kalah.rest.models;


public class GameStartData {
    
    private String playerOne;
    private String playerTwo;
    
    public String getPlayerOne() {
        return playerOne;
    }
    
    public void setPlayerOne(final String playerOne) {
        this.playerOne = playerOne;
    }
    
    public String getPlayerTwo() {
        return playerTwo;
    }
    
    public void setPlayerTwo(final String playerTwo) {
        this.playerTwo = playerTwo;
    }
}
