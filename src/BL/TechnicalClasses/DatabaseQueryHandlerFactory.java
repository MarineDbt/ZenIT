package BL.TechnicalClasses;



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
	
	/* public SupervisorPersistenceHandler createSupervisorPersistenceHandler()
	{
		
		return new SupervisorQueryHandler();
	} 

	public UserPersistenceHandler createUserPersistenceHandler()
	{
		return new UserQueryHandler();
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
	
	public ShoppingPersistenceHandler createShoppingPersistenceHandler()
	{
		return new ShoppingQueryHandler();
	}
	
	public NotificationPersistenceHandler createNotificationPersistenceHandler()
	{
		return new NotificationQueryHandler();
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
	*/
	
	public EventPersistenceHandler createEventPersistenceHandler()
	{
		return new EventQueryHandler();
	}
	
	public ActivityPersistenceHandler createActivityPersistenceHandler()
	{
		return new ActivityQueryHandler();
	}
	
	/* public OrderPersistenceHandler createOrderPersistenceHandler()
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
