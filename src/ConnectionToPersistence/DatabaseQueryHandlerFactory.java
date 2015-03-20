package ConnectionToPersistence;

public class DatabaseQueryHandlerFactory extends AbstractPersistenceHandlerFactory {
	
	/* Attributes */
	
	private static DatabaseQueryHandlerFactory myConcreteFactory;
	
	
	/* Constructor */
	private DatabaseQueryHandlerFactory()
	{
		super();
	}
	
	/* Creation method */
	
	public static DatabaseQueryHandlerFactory createFactory ()
	{
		if (myConcreteFactory == null) {
			myConcreteFactory = new DatabaseQueryHandlerFactory();
		}
		return myConcreteFactory;
	}
	
	/* Creation methods of QueryHandlers */
	
	

	public UserAbstractPersistenceHandler createUserPersistenceHandler()
	{
		return new UserQueryHandler();
	}
	public ShoppingAbstractPersistenceHandler createShoppingPersistenceHandler()
	{
		return new ShoppingQueryHandler();
	}
	public NotificationAbstractPersistenceHandler createNotificationPersistenceHandler()
	{
		return new NotificationQueryHandler();
	}
	
	/*
	public SupervisorPersistenceHandler createSupervisorPersistenceHandler()
	{
		
		return new SupervisorQueryHandler();
	}
	
	public ContributorPersistenceHandler createContributorPersistenceHandler()
	{
		return new ContributorQueryHandler();
	}
	
	public AdminPersistenceHandler createAdminPersistenceHandler()
	{
		return new AdminQueryHandler();
	}
	
	public MemberPersistenceHandler createMemberPersistenceHandler()
	{
		return new MemberQueryHandler();
	}
	
	public RoomPersistenceHandler createRoomPersistenceHandler()
	{
		return new RoomQueryHandler();
	}
	
	public CategoryPersistenceHandler createCategoryPersistenceHandler()
	{
		return new CategoryQueryHandler();
	}
	
	public MyActivitesPersistenceHandler createMyActivitiesPersistenceHandler()
	{
		return new MyActivitiesQueryHandler();
	}
	
	
	public EventPersistenceHandler createEventPersistenceHandler()
	{
		return new EventQueryHandler();
	}
	
	public ActivityPersistenceHandler createActivityPersistenceHandler()
	{
		return new ActivityQueryHandler();
	}
	
	public OrderPersistenceHandler createOrderPersistenceHandler()
	{
		return new OrderQueryHandler();
	}
	
	public ProductPersistenceHandler createProductPersistenceHandler()
	{
		return new ProductQueryHandler();
	}
	
	public AdhesionPersistenceHandler createAdhesionPersistenceHandler()
	{
		return new AdhesionQueryHandler();
	}
	*/
}
