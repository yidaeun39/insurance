package insurance.infra;

import insurance.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReivewHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Reivew>> {

    @Override
    public EntityModel<Reivew> process(EntityModel<Reivew> model) {
        return model;
    }
}
