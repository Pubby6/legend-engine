// Copyright 2021 Goldman Sachs
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

package org.finos.legend.engine.plan.generation.extension;

import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.MutableList;
import org.finos.legend.engine.plan.generation.transformers.PlanTransformer;
import org.finos.legend.engine.shared.core.extension.LegendPlanExtension;

public interface PlanGeneratorExtension extends LegendPlanExtension
{
    @Override
    default String type()
    {
        return "Unknown " + this.getClass().getName();
    }

    @Override
    default String group()
    {
        return "Unknown " + this.getClass().getName();
    }

    default MutableList<PlanTransformer> getExtraPlanTransformers()
    {
        return Lists.fixedSize.empty();
    }
}
