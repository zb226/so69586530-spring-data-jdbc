package zb226.qa.so69586530.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("outlet")
public class Outlet {

	@Id
	private String outletId;

    @MappedCollection(idColumn = "outlet_id", keyColumn = "id")
    private Map<String, OutletOfferedService> offeredServices;

	public String getOutletId() {
		return outletId;
	}

	public Map<String, OutletOfferedService> getOfferedServices() {
		return offeredServices;
	}

	@Override
	public String toString() {
		return "Outlet [outletId=" + outletId + ", offeredServices=" + offeredServices + "]";
	}
	
}
