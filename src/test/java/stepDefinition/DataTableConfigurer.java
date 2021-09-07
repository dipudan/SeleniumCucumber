package stepDefinition;

import dataTemplate.User;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class DataTableConfigurer implements TypeRegistryConfigurer{

    /*
     * Maps datatables in feature files to custom domain objects.
     */

        @Override
        public Locale locale() {
            return Locale.ENGLISH;
        }

        @Override
        public void configureTypeRegistry(TypeRegistry registry) {
            registry.defineDataTableType(new DataTableType(User.class, new TableEntryTransformer<User>() {
                @Override
                public User transform(Map<String, String> entry) {
                    return new User(entry.get("username"), entry.get("password"));
                }
            }));
        }
}
