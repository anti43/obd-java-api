package com.github.pires.obd.commands.control;

/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Distance traveled since codes cleared-up.
 */
public class TimeSinceTCClearedObdCommand extends ObdCommand {

    private int min = 0;

    /**
     * Default ctor.
     */
    public TimeSinceTCClearedObdCommand() {
        super("01 4E");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link TimeSinceTCClearedObdCommand} object.
     */
    public TimeSinceTCClearedObdCommand(
            TimeSinceTCClearedObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 31] of the response
        min = buffer.get(2) * 256 + buffer.get(3);
    }

    public String getFormattedResult() {
        return getCalculatedResult() + "" + getResultUnit();
    }


    @Override
    public String getCalculatedResult() {
        return String.valueOf(min);
    }

    @Override
    public String getResultUnit() {
        return "min";
    }


    @Override
    public String getName() {
        return AvailableCommandNames.TIME_SINCE_TC_CLEARED.getValue();
    }

}