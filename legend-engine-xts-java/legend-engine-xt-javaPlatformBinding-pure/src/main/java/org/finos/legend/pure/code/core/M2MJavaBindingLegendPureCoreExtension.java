// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.code.core;

import org.finos.legend.engine.pure.code.core.JavaBindingLegendPureCoreExtension;

public class M2MJavaBindingLegendPureCoreExtension implements JavaBindingLegendPureCoreExtension
{
    @Override
    public String group()
    {
        return "ST_M2M";
    }

    @Override
    public String functionFile()
    {
        return "core_java_platform_binding/legendJavaPlatformBinding/store/m2m/m2mLegendJavaPlatformBindingExtension.pure";
    }

    @Override
    public String functionSignature()
    {
        return "meta::pure::mapping::modelToModel::executionPlan::platformBinding::legendJava::inMemoryExtensionsJavaPlatformBinding__Extension_1_";
    }
}
