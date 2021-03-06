/*
 * Copyright (C) 2014 nohana, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package jp.co.nohana.widget.tutorial.sample;

import android.app.Application;

import jp.co.nohana.widget.tutorial.FeatureTutorialViewManager;

/**
 * @author keishin.yokomaku
 * @since 2014/05/20
 */
public class TutorialSampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FeatureTutorialViewManager.initialize(this);
    }

    @Override
    public void onTerminate() {
        FeatureTutorialViewManager.destroy();
        super.onTerminate();
    }
}
