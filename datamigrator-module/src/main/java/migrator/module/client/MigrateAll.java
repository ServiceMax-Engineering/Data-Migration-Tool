package migrator.module.client;

import java.util.ArrayList;
import java.util.List;

import migrator.core.sobject.MigrableObjectFactory;
import migrator.core.utils.CommandVO;

public class MigrateAll {
	public void process() {

	   List<CommandVO> list = new ArrayList<CommandVO>();

	   list.add(new CommandVO("create", "Account.json"));
	   list.add(new CommandVO("create", "AvailableService.json"));
	   list.add(new CommandVO("create", "Contact.json"));
	   list.add(new CommandVO("create", "BusinessHours.json"));
	   list.add(new CommandVO("create", "Territory.json"));
	   list.add(new CommandVO("create", "Location.json"));
	   list.add(new CommandVO("create", "Currency.json"));

	   list.add(new CommandVO("create", "Products.json"));
	   list.add(new CommandVO("create", "ActivityMaster.json"));
	   list.add(new CommandVO("create", "ServicePricebook.json"));
	   list.add(new CommandVO("create", "StockHistory.json"));
	   list.add(new CommandVO("create", "StockTransfer.json"));

	   list.add(new CommandVO("create", "SLATerms.json"));
	   list.add(new CommandVO("create", "ServiceContract.json"));
	   list.add(new CommandVO("create", "ServicePlan.json"));
	   list.add(new CommandVO("create", "WarrantyTerms.json"));
	   list.add(new CommandVO("create", "ServiceTeam.json"));
       
	   list.add(new CommandVO("create", "ProductIQTemplate.json"));
	   list.add(new CommandVO("create", "InstalledProduct.json"));
	   list.add(new CommandVO("create", "AttributesTemplate.json"));
	   list.add(new CommandVO("create", "AttrTemplateInstance.json"));
	   list.add(new CommandVO("create", "AttributesHistory.json"));
	   list.add(new CommandVO("create", "ProductAttributes.json"));

	   list.add(new CommandVO("create", "TaskTemplate.json"));
	   list.add(new CommandVO("create", "PMPlanTemplate.json"));
	   list.add(new CommandVO("create", "PMPlan.json"));

	   list.add(new CommandVO("create", "Case.json"));
	   list.add(new CommandVO("create", "WorkOrder.json"));
	   list.add(new CommandVO("create", "PartsRequest.json"));
	   list.add(new CommandVO("create", "PartsOrder.json"));

	   MigrableObjectFactory.migrate(list);
	}

   	static public void main(String[] args) {
   		MigrateAll migrate = new MigrateAll();
   		migrate.process();
	}
}


