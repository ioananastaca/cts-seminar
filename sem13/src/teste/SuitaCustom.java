package teste;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateCategory;

@RunWith(Suite.class)
@SuiteClasses({ TestGrupa.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory(GetPromovabilitateCategory.class)
public class SuitaCustom {

}
